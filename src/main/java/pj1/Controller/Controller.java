package pj1.Controller;

import java.util.ArrayList;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sound.midi.Soundbank;
import javax.transaction.Transactional;

import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import pj1.Dao.AdminDao;
import pj1.Dao.CandidateDao;
import pj1.Dao.VoterDao;
import pj1.Model.Admin;
import pj1.Model.Candidate;
import pj1.Model.Voter;

@org.springframework.stereotype.Controller
public class Controller {
	
//	1ST TRY CODE

//	@Autowired
//	private AdminService adminService;
//
//	@Autowired
//	private VoterService voterService;
//
//	@Autowired
//	private AdminDao adminDao;
//
//	@Autowired
//	private CandidateDao candidateDao;
//
//	@Autowired
//	private CandidateService candidateService;
//
//	@RequestMapping("/")
//	public String homePage() {
//
//		return "home";
//	}
//
//	@RequestMapping("/adminLogin")
//	public String adminLogin() {
//
//		return "adminLogin";
//	}
//
//	@Transactional
//	@RequestMapping(path = "/adminPage")
//	public String adminPage(@ModelAttribute Admin admin, Model model,HttpServletRequest request) {
//
//		
//		if (!admin.getAdminPassword().equals(adminService.getAdminPass(admin.getAdminId()))) {
//			System.out.println("Wrong Id or Password");
//			return "redirect:/adminLogin";
//		} else {
//			List<Candidate> lcandidate = candidateService.getCandidateall();
//			model.addAttribute("lcandidate", lcandidate);
//			HttpSession s =request.getSession(true);
//			s.setAttribute("Id",admin.getAdminId());
//			return "adminPage";
//		}
//	}
//
//	@RequestMapping("/adminPage/delete/{candidateId}")
//	public String deleteCandidate(HttpServletRequest request, @PathVariable("candidateId") int ID) {
//		System.out.println("Delete redirect 1");
//		this.candidateDao.candidateDelete(ID);
//		System.out.println("Delete redirect 2");
//		return "redirect:/adminPage/";
//
//	}
//
//	@Transactional
//	@RequestMapping("/adminPage/edit/{candidateId}")
//	public String editCandidate(HttpServletRequest request, @PathVariable("candidateId") int ID, Model model) {
//		System.out.println("getCandidate RUNS");
//		Candidate candidate = this.candidateService.getCandidate(ID);
//		model.addAttribute("candidate", candidate);
//		System.out.println("Update RUNS");
//		return "editCandidate";
//
//	}
//
//	@Transactional
//	@RequestMapping(value = "/adminPage/update/{candidateId}")
//	public String updateCandidate(@PathVariable("candidateId") int ID, @ModelAttribute Candidate candidate) {
//		this.candidateService.createCandidate(candidate);
//
//		return "adminLogin";
//	}	@Transactional
//	public void candidateSave(Candidate candidate) {
//
//		this.hibernateTemplate.save(candidate);
//	}
//	
//	
//	@Transactional
//	@RequestMapping(value = "/adminPage/addCandidate")
//	public String addCandidate() {
//		return "addCandidate";
//	}
//	
//	@Transactional
//	@RequestMapping(value = "/adminPage/add")
//	public String add(@ModelAttribute Candidate candidate) {
//		this.candidateService.createCandidate(candidate);
//		return "adminLogin";
//	}
//	
//	
//
////	@ExceptionHandler(value = Exception.class)
////	public String exceptionHandle() {
////		return "error";
////
////	}
//
//	@RequestMapping("/voterLogin")
//	public String voterLogin() {
//
//		return "voterLogin";
//	}
//
//	@Transactional
//	@RequestMapping(path = "/voterPage")
//	public String voterPage(@ModelAttribute Voter voter, Model model) {
//
//		if ((voterService.getVoter(voter.getVoterId())) == null
//				|| !voter.getVoterPassword().equals(voterService.getVoterPass(voter.getVoterId()))) {
//			System.out.println("Wrong Id or Password");
//			return "voterLogin";
//		} else {
//			return "voterPage";
//		}
//	}

	
	
	
	
	
//	CODE FOR ADMIN
	
	
	@Autowired
	private AdminDao adminDao;
	
	@Autowired
	private CandidateDao candidateDao ;

	@RequestMapping("/home")
	public String homePage() {
		return "home";
	}

	@RequestMapping("/adminLogin")
	public String adminLogin() {
		return "adminLogin";
	}
	
	@RequestMapping(value = "/dashboard", method = {RequestMethod.POST ,RequestMethod.GET})
	public String dashboard(@ModelAttribute Admin admin, HttpServletRequest request) {
		try {
			if (admin.getAdminPassword().equals(adminDao.adminget(admin.getAdminId()).getAdminPassword())) {			
				request.setAttribute("adminId",admin.getAdminId());
				return "dashboard";
			} else {
				return "redirect:/adminLogin";
			}
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Wrong Id or Password");
			return "redirect:/adminLogin";

		}
	}
	
	@RequestMapping(value = "/candidateList")
	public String adminPage(HttpServletRequest request,Model model) {
		List<Candidate> candidates =candidateDao.candidategetall();
		model.addAttribute("candidates",candidates);
		return "candidateList";
	}
	
	@RequestMapping(value="/addCandidatePage")
	public String addCandidatePage()
	{		
		return "addCandidate";
	}
	
	@RequestMapping(value="/addCandidate")
	public String addCandidate(@ModelAttribute Candidate candidate)
	{	
		candidateDao.candidateSaveOrUpdate(candidate);
		return "redirect:/candidateList";
	}
	
	@RequestMapping(value="/delete/{candidateId}")
	public String deleteCandidate(@PathVariable("candidateId") int Id)
	{	
		candidateDao.candidateDelete(Id);
		return "redirect:/candidateList";
	}
	
	@RequestMapping(value="/updatePage/{candidateId}")
	public String updateCandidatePage(@PathVariable("candidateId") int Id,Model model)
	{	
		Candidate can=candidateDao.candidateget(Id);
		model.addAttribute("candidate",can);
		return "updateCandidatePage";
	}
	
	@RequestMapping(value="/update/{candidateId}")
	public String updateCandidate(@ModelAttribute Candidate candidate)
	{	
		candidateDao.candidateSaveOrUpdate(candidate);
		return "redirect:/candidateList";
	}
	
	
	//******************************************************************************************************************//
	
	@Autowired
	private VoterDao voterDao;
	
	@RequestMapping("/voterList")
	public String voterList(Model model)
	{
		List<Voter> voter =voterDao.votergetall();
		model.addAttribute("voters",voter);
		return "voterList";
	}
	
	@RequestMapping(value="/addVoterPage")
	public String addVoterPage(@ModelAttribute Voter voter)
	{	
		return "addVoter";
	}
	
	@RequestMapping(value="/addVoter")
	public String addVoter(@ModelAttribute Voter voter)
	{	
		voterDao.voterSaveOrUpdate(voter);
		return "redirect:/voterList";
	}
	
	@RequestMapping("/deleteVoter/{voterId}")
	public String deleteVoter(@PathVariable("voterId") int ID)
	{
		System.out.println("deleteVoter");
		voterDao.voterDelete(ID);
		return "redirect:/voterList";
	}
	
	@RequestMapping("/updateVoterPage/{voterId}")
	public String updateVoterPage(@PathVariable("voterId") int ID,Model model)
	{
		Voter voter =voterDao.voterget(ID);
		model.addAttribute("voter", voter);
		return "updateVoterPage";
	}
	
	@RequestMapping(value="/updateVoter/{voterId}",method = RequestMethod.POST)
	public  String updateVoter(@ModelAttribute Voter voter)
	{
		voterDao.voterSaveOrUpdate(voter);
		return "redirect:/voterList";
	}
	
}
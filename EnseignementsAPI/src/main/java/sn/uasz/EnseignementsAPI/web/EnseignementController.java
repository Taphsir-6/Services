package sn.uasz.EnseignementsAPI.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sn.uasz.EnseignementsAPI.entities.Enseignement;
import sn.uasz.EnseignementsAPI.repository.EnseignementRepository;

import java.util.List;
import java.util.stream.IntStream;

@Controller
public class EnseignementController {

    @Autowired
    private EnseignementRepository enseignementRepository;

    // Affichage de la liste des enseignements avec pagination et recherche
    @GetMapping("/index")
    public String index(Model model,
                        @RequestParam(name = "page", defaultValue = "0") int page,
                        @RequestParam(name = "size", defaultValue = "5") int size,
                        @RequestParam(name = "keyword", defaultValue = "") String kw) {
        // Rechercher les enseignements par code avec pagination
        Page<Enseignement> pageEnseignements = enseignementRepository.findByCodeContains(kw, PageRequest.of(page, size));
        model.addAttribute("listEnseignements", pageEnseignements.getContent());
        model.addAttribute("pages", IntStream.range(0, pageEnseignements.getTotalPages()).toArray());
        model.addAttribute("currentPage", page);
        model.addAttribute("keyword", kw);
        return "enseignement";
    }

    // Suppression d'un enseignement
    @GetMapping("/deleteEnseignement")
    public String deleteEnseignement(@RequestParam(name = "id") Long id,
                                     @RequestParam(name = "keyword", defaultValue = "") String keyword,
                                     @RequestParam(name = "page", defaultValue = "0") int page) {
        enseignementRepository.deleteById(id);
        return "redirect:/index?page=" + page + "&keyword=" + keyword;
    }

    // Formulaire pour ajouter un nouvel enseignement
    @GetMapping("/formEnseignement")
    public String formEnseignement(Model model) {
        model.addAttribute("enseignement", new Enseignement());
        return "formEnseignement";
    }

    // Sauvegarder un enseignement
    @PostMapping("/saveEnseignement")
    public String saveEnseignement(Enseignement enseignement) {
        // Pas de validation dans cette version, directement sauvegarder l'entité
        enseignementRepository.save(enseignement);
        return "redirect:/index";
    }

    // Formulaire pour éditer un enseignement existant
    @GetMapping("/editEnseignement")
    public String editEnseignement(@RequestParam(name = "id") Long id, Model model) {
        Enseignement enseignement = enseignementRepository.findById(id).orElse(null);
        if (enseignement == null) {
            return "redirect:/index";
        }
        model.addAttribute("enseignement", enseignement);
        return "editEnseignement";
    }

}

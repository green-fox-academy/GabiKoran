package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {

    private List<BankAccount> bankAccounts;

    public BankController() {
        bankAccounts = new ArrayList<>();

        bankAccounts.add(new BankAccount("Simba", 2000, "lion", true, true));
        bankAccounts.add(new BankAccount("Nala", 2000, "lion", false, true));
        bankAccounts.add(new BankAccount("Timon", 1300, "suricate", false, true));
        bankAccounts.add(new BankAccount("Pumbaa", 1200, "common warthog", false, true));
        bankAccounts.add(new BankAccount("Zazu", 4700, "red-billed hornbill", false, true));
        bankAccounts.add(new BankAccount("Shenzi", 500, "spotted hyena", false, false));
        bankAccounts.add(new BankAccount("Banzai", 325, "spotted hyena", false, false));
        bankAccounts.add(new BankAccount("Ed", 700, "spotted hyena", false, false));
    }

    @GetMapping("/show")
    public String show (Model model) {
        if (bankAccounts != null) {
            model.addAttribute("list", bankAccounts);
        } else {
            model.addAttribute("error", "No account found");
        }

        return "show-bank-accounts";
    }

    @RequestMapping(path = "/show/{name}/details", method = RequestMethod.GET)
    public String getBankAccountByOwnerName(Model model, @PathVariable String name) {
        BankAccount bankAccountByName = null;

        for(BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getName().equals(name)) {
                bankAccountByName = bankAccount;
            }
        }

        if (bankAccountByName != null) {
            model.addAttribute("account", bankAccountByName);
        } else {
            model.addAttribute("error", "No account found");
        }

        return "details";
    }
}

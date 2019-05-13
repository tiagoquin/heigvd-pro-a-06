package heigvd.ch.segfaultapi.controller;

import heigvd.ch.segfaultapi.model.Role;
import heigvd.ch.segfaultapi.repositories.RoleRepoitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The type Role controller.
 */
@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private RoleRepoitory roleRepoitory;

    /**
     * Gets all.
     *
     * @return the all
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Role> getAll() {
        System.out.println("Get all tags...");

        return roleRepoitory.findAll();
    }
}

package com.example.firstYearExamProject.Service;

import com.example.firstYearExamProject.Model.Project;
import com.example.firstYearExamProject.Repository.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    // Oliver

@Service
public class ProjectService {
    @Autowired
    ProjectRepo projectRepo;


    public List<Project> fetchAllProjects() {
        return projectRepo.fetchAllProjects();
    }

    public Project createProject(Project project) {
        return projectRepo.createProject(project);
    }

    public Project findProjectById(int projectID) {
        return projectRepo.findProjectById(projectID);
    }

    public Project editProject(int projectID, Project project) {
        return projectRepo.editProject(projectID, project);
    }

    /* Currently not possible because of conflicts with primary keys and foreign keys,
    look at deleteSession for a working delete function

    public boolean deleteProject(String projectID){
        return projectRepo.deleteProject(projectID);
    } */
}

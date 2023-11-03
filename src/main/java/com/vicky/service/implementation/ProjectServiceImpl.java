package com.vicky.service.implementation;

import com.vicky.model.Project;
import com.vicky.repository.ProjectRepository;
import com.vicky.service.ProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ProjectServiceImpl implements ProjectService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProjectServiceImpl.class);
    @Autowired
    private ProjectRepository projectRepository;
    @Override
    public Project getProjectDetails(Long id) {
        LOGGER.info("ProjectServiceImpl() - getProjectDetails by id: {}", id);
        Optional<Project> fetchedProject = projectRepository.findById(id);

        if(fetchedProject.isPresent())
            return fetchedProject.get();
        return null;
    }
}

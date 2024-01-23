/**
 * The `Project` class represents a project entity with an ID, name, and a set of source files.
 */
package edu.tum.ase.project.model;

import java.util.Set;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.*;

@Entity
@Table(name = "projects")
public class Project {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "project_id")
    private String id;
    @Column(name = "name", nullable = false, unique = true)
    private String name;
    @Column(name = "user_ids", unique = true, nullable = true)

    // ... additional members, often include @OneToMany mappings
    @OneToMany(mappedBy = "project", cascade = CascadeType.REMOVE)
    private Set<SourceFile> sourceFiles;

    protected Project() {
        // no-args constructor required by JPA spec
        // this one is protected since it shouldn't be used directly
    }

    public Project(String name) {
        this.name = name;
    }
    // getters and setters
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setId(String id) { this.id = id; }

    public void setName(String name) {
        this.name = name;
    }

    // public Set<SourceFile> getSourceFiles() {
    //     return sourceFiles;
    // }

    // public void setSourceFiles(Set<SourceFile> sourceFiles) {
    //     this.sourceFiles = sourceFiles;
    // }

}
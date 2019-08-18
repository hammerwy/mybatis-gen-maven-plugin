package com.wy;

import com.wy.constant.Suffix;
import com.wy.jgit.Jgit;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.plugins.annotations.ResolutionScope;

/**
 * @author wy
 */
@Mojo(
        name = "delBranch",
        defaultPhase = LifecyclePhase.GENERATE_SOURCES,
        requiresDependencyResolution = ResolutionScope.RUNTIME
)
public class MybatisDelBranch extends AbstractMojo {


    @Override
    public void execute() throws MojoExecutionException {
        Jgit jgit = Jgit.open(getLog());
        jgit.delBranch(branchName + Suffix.Branch.GEN);
    }

    @Parameter(defaultValue = "gen_branch_this_is_gen_branch")
    private String branchName;
}

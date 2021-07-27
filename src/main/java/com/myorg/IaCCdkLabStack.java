package com.myorg;

import software.amazon.awscdk.core.Construct;
import software.amazon.awscdk.core.Stack;
import software.amazon.awscdk.core.StackProps;
import software.amazon.awscdk.services.iam.AccountRootPrincipal;
import software.amazon.awscdk.services.iam.Role;
import software.amazon.awscdk.services.iam.RoleProps;

public class IaCCdkLabStack extends Stack {
    public IaCCdkLabStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public IaCCdkLabStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);
        new Role(this, "tmp_yakim_role_id", new RoleProps.Builder()
                .assumedBy(new AccountRootPrincipal())
                .roleName("tmp_yakim_role")
                .path("test_path")  // just comment this row after creating stack and try to cdk deploy again to get the custom name update specific error
                .build()
        );
    }
}

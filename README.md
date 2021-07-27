# Welcome to your CDK Java project!


To reproduce "CloudFormation cannot update a stack when a custom-named resource requires replacing." 
 - cdk deploy
 - make sure that role tmp_yakim_role_id exists
 - comment com/myorg/IaCCdkLabStack.java:20  (path)
 - cdk diff
 - cdk deploy
 - make sure stack failed. It will always fail in similar cases (resource has specified name ann we are trying to 
   change any attribute for any AWS resource that has replacement update behavioral) See also [Update behaviors of stack resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html)



This is a blank project for Java development with CDK.

The `cdk.json` file tells the CDK Toolkit how to execute your app.

It is a [Maven](https://maven.apache.org/) based project, so you can open this project with any Maven compatible Java IDE to build and run tests.

## Useful commands

 * `mvn package`     compile and run tests
 * `cdk ls`          list all stacks in the app
 * `cdk synth`       emits the synthesized CloudFormation template
 * `cdk deploy`      deploy this stack to your default AWS account/region
 * `cdk diff`        compare deployed stack with current state
 * `cdk docs`        open CDK documentation

Enjoy!

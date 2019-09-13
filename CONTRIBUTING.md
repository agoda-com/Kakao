Contributing to Kakao
------------------------------------


Tags
----

* Enhancement - This tag is assigned to an issue when it addresses an enhancement to the existing code-base.

* Duplicate - This tag is assigned to an issue when there is already an open ticket for the same issue.

* Bug - This tag is assigned to an issue when it addresses a bug in existing code-base.

* Invalid - This tag is assigned to an issue when it does not fall under the scope of this project.

General Workflow
----------------

The steps below describe how to get a patch into a master branch.

1. Find an open issue or create a new issue on [issue tracker](https://github.com/agoda-com/kakao/issues) for the work you want to contribute. In case you wish to work on an existing issue make sure no one else is working on it. Comment on the issue declaring you are willing to take it up to avoid possible conflicts and reworks. Also avoid picking up issues tagged as Invalid.
2. [Fork the project](https://github.com/agoda-com/kakao#fork-destination-box) on GitHub. You'll need to create a feature-branch for your work on your fork, as this way you'll be able to submit a pull request against Kakao.
3. Continue working on the feature branch until you are satisfied. Add tests for new features and modify existing tests if required.
4. Run all unit tests from sbt and make sure all of them pass.
5. Run code coverage to check if the lines of code you added are covered by unit tests.
6. Once your feature is complete, prepare the commit with appropriate message and the issue number. e.g. this commit is a sample #12.
7. Apply code style for library and sample projects
8. Create a [pull request](https://help.github.com/articles/about-pull-requests/) and wait for the users to review.
9. Sign [Contributor License Agreement](https://github.com/agoda-com/kakao/blob/master/CLA.md) if not already signed.
10. Once everything is said and done, your pull request gets merged. Your feature will be available with the next release.

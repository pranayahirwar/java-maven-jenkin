#!/usr/bin/env groovy
def call() {
    echo "Building Maven Package in $BRANCH_NAME"
    echo "mvn package"
//    sh "mvn package"

}

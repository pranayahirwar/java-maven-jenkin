#!/usr/bin/env groovy
package com.example

class Docker implements Serializable {
    def script

    Docker(script) {
        this.script = script
    }

    def dockerbuildImage(String imageName) {
        // Here groovy don't understand what echo commands and sh commands are, because of which we need to include " script. "
        script.echo "Building docker image in $script.BRANCH_NAME"
        script.echo "docker build -t $imageName ."
//        script.sh "docker build -t $imageName ."
        script.echo "Image is build, pushing to docker hub"
        sleep(2)
        script.echo "**"
        sleep(2)
        script.echo "******"
        sleep(2)
        script.echo "********"
        sleep(2)
        script.echo "**********"
        script.echo "Image successfully deployed to dockerHub. :)"
    }
}
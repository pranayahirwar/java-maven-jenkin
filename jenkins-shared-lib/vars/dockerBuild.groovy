#!/usr/bin/env groovy

import com.example.Docker

def call(String imageName) {
    return new Docker(this).dockerbuildImage(imageName)
//     withCredentials([usernamePassword(credentialsId: 'dockerHubCred', usernameVariable:'USER', passwordVariable:'PSD')]) {
//         sh "echo $PSD | docker login -u $USER --password-stdin "
//         sh "docker push $imageName"
//  }
}
// $imageName = dockerHub/repoName-app:jam-100.1
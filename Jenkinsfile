node { 
    stage('checkout') {
        checkout scm
    }
    
    stage('build') {
        if (isUnix()) {
            sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package"
        } else {
            bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
        }
    }
    
    stage('results') {
        junit '**/target/surefire-reports/TEST-*.xml'
    }
}

pipeline{
	agent any
	stages{
		stage ('clean stage'){
			steps{
				sh 'chmod +x gradlew'
				sh './gradlew clean'
			}
		}
		stage ('build stage'){
			steps{
				sh 'chmod +x gradlew'
				sh './gradlew build'
			}
		}
		stage ('deployment stage'){
			steps{				
				java -jar ./build/libs/jenkins-pipeline-0.0.1.jar
			}
		}
	}
}
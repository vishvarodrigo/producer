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
				sh 'java -jar rabbitmq-producer-service-0.0.1.jar'
			}
		}
	}
}
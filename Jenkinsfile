pipeline{
	agent any
	stages{
		stage ('clean stage'){
			steps{
				sh './gradlew clean'
			}
		}
		stage ('build stage'){
			steps{
				sh './gradlew build'
			}
		}
		stage ('deployment stage'){
			steps{
				echo 'deployment stage'
			}
		}
	}
}
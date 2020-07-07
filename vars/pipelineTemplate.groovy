def call(Map pipelineParams) 
{
  pipeline
  {	
    agent any	
      stages	
      {		
          stage('environment')		
          {			
              steps			
              {				
                  echo "ENV_NAME :::::: ${pipelineParams.ENV_NAME}"	
              }		
           }		
           stage('config')
           {	
              steps			
              {				
                  echo "CONFIG_FLAG :::::: ${pipelineParams.CONFIG_FLAG}"	
               }		
            }	
           stage('notification')
           {	
              steps			
              {				
                  echo "SLACK_CHANNEL :::::: ${pipelineParams.SLACK_CHANNEL}"	
               }		
            }		
         }
      }
}

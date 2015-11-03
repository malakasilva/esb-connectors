#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/*
*  Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package ${package};

import org.wso2.carbon.mediation.library.connectors.core.AbstractConnector;
import org.wso2.carbon.mediation.library.connectors.core.ConnectException;
import org.wso2.carbon.mediation.library.connectors.core.util.ConnectorUtils;

public class ${connector_name} extends AbstractConnector {

    @Override
    public void connect() throws ConnectException {
        String templateParam = getParameter("generated_param");
        
        try {
            System.out.println("Hello WORLD " + "${connector_name} !!!" + " : paramter :" + templateParam); 	
            /**Add your connector code here 
            **/
            
        } catch (Exception e) {
            //System.out.println("ERROR : " + e.getMessage());
	    throw new ConnectException(e);	
        }
    }
}
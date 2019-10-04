/**
 * @author wchao
 * @version 2019-09-27
 */
package aws.example.ec2;
import java.util.Map;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * Load configuration in LSF cluster, including
 * $LSF_TOP/10.1/install/aws_enable.config
 * $LSF_ENVDIR/resource_connector/aws/conf/awsprov_templates.json
 */
public class LoadConfig
{
    public String getLSFEnv(){
        Map map = System.getenv();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()){
            Entry entry = (Entry)it.next();
            if(entry.getKey().equals("LSF_ENVDIR")){
                System.out.println("$LSF_ENVDIR=" + entry.getValue());
                return entry.getValue().toString();
            }
        }
        return "Please source the LSF environment firstly";
    }

    public String LoadTemplates(String env){
	
    }
    public static void main(String[] args)
    {
        LoadConfig lc = new LoadConfig();
        String env = lc.getLSFEnv();
        System.out.println(env);

    }
}

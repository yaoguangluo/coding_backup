package OCI.AMV.ECS.SVQ.MPC.fhmm.C;
import java.io.IOException;
import java.util.Map;

import OCI.ME.analysis.C.A;
public interface SensingMap{
	void IV_LenovoMap(A _A) throws IOException;
	public Map<String, Object> getLenovoMap();
	public void I_LenovoMap(Map<String, Object> lenovoMap);
}
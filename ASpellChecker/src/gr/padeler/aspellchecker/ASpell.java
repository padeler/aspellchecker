/**
 * 
 */
package gr.padeler.aspellchecker;

import android.util.Log;

/**
 * @author padeler
 *
 */
public class ASpell
{
	public static final String TAG = ASpell.class.getSimpleName(); 
	
	static 
	{  
	    System.loadLibrary("aspell");
	    
	}
	
	public ASpell(String dataDir, String locale)
	{
		Log.d(TAG, "ASpell Speller Initializing....");
		
		boolean res = initialize(dataDir, locale);
		Log.d(TAG, "ASpell Speller Initialized ("+res+")");
	}
	
	public native String[] check(String str);
	public native boolean initialize(String dataDir, String locale);
}

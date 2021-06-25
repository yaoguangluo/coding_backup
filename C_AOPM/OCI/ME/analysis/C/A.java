package OCI.ME.analysis.C;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
import PEQ.AMV.ECS.test.SensingTest;
public interface A {
	void IV_() throws IOException;
	void IV_Mixed() throws IOException;
	List<String> parserString(String input);
	void I_FixWords(int charPosition, String inputString,StringBuilder[] fixWords);
	Map<String, WordFrequency> getWordFrequencyMap(List<String> sets) throws IOException;
	List<WordFrequency> sortWordFrequencyMap(Map<String,WordFrequency> map) throws IOException;
	List<WordFrequency> getWordFrequency(List<String> sets)throws IOException;
	Map<Integer,WordFrequency> getWordFrequencyByReturnSortMap(List<String> sets) throws IOException;
	Map<Integer,WordFrequency> sortWordFrequencyMapToUnsortMap(Map<String,WordFrequency> map);
	Map<Integer,WordFrequency> sortWordFrequencyMapToSortMap(Map<String,WordFrequency> map);
	Map<String,WordFrequency> parserStringByReturnFrequencyMap(String inputString);
	Map<String,String> getPosEnToCn();
	Map<String,String> getPosEnToEn();
	Map<String,String> getPosCnToCn();
	Map<String,String> getEnToCn();
	Map<String,String> getCnToEn();
	Map<String,String> getFullEnToCn();
	Map<String,String> getFullCnToEn();
	String[] parserEnglishString(String englishString);
	List<String> parserMixedString(String mixedString);
	Map<String,WordFrequency> parserMixStringByReturnFrequencyMap(String key);
	void studyNewWord(String study, String token, String posStudy);
	Map<String, String> getStudyPos();
	Map<String, String> getPinYin();
	Map<String, String> getCtT();
	Map<String, String> getCtK();
	Map<String, String> getCtJ();
	Map<String, String> getCtR();
	Map<String, String> getCtA();
	EmotionMap getEmotionMap();
	SensingTest getSensingTest();
}
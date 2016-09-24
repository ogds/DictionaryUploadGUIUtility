/**
 * 21 X 2015
 * @author Eduard Ragimov
 * <SeveneduS@gmail.com>
 */
package utilities;


public class Dictionary {
    private Language.LanguageType   dictionaryLanguage;
    private String                  dictionaryName;
    
    /**
     *Constructors goes here
     */
    public Dictionary(){
        SetDictionaryLanguage(  Language.LanguageType.EnglishUS);
        SetDictionaryName(      "English_");
    }
    
    public Dictionary(  Language.LanguageType dictionaryLanguage,
                        String dictionaryName)
    {
        SetDictionaryLanguage(dictionaryLanguage);
        SetDictionaryName(dictionaryName);
    }

    final public void SetDictionaryName( String dict_name ){
        this.dictionaryName = dict_name;
    }
    
    final public void SetDictionaryLanguage( Language.LanguageType language )
    {
        this.dictionaryLanguage = language;
    }
    
    final public String GetDictionaryName(){
        return this.dictionaryName;
    }
    
    final public Language.LanguageType GetDictionaryLanguage()
    {
        return this.dictionaryLanguage;
    }
}

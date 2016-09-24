/**
 * 21 X 2015
 * @author Eduard Ragimov
 * <SeveneduS@gmail.com>
 */
package utilities;

public class Language {
    public enum LanguageType{
        EnglishAU,
        EnglishUK,
        EnglishUS,
        French,
        Deutch,
        Azeri,
        Russian,
        Ukrainian;
        
        @Override
        public String toString() {
           return this.name();
        }
    }
}

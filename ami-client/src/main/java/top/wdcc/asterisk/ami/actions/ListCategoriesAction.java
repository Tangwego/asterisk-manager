package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_ListCategories">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_ListCategories
 * </a>
 * @author wavin
 */
public class ListCategoriesAction extends AmiAction {
    private static final String ACTION = "ListCategories";
    public ListCategoriesAction(String fileName) {
        super(ACTION);
        addParams("FileName", fileName);
    }
}

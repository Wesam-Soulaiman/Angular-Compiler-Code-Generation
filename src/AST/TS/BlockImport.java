package AST.TS;

public class BlockImport extends ImportContent {
    private NamedImportBlock namedImportBlock;

    public BlockImport(NamedImportBlock namedImportBlock) {
        this.namedImportBlock = namedImportBlock;
    }

    public NamedImportBlock getNamedImportBlock() {
        return namedImportBlock;
    }

    public void setNamedImportBlock(NamedImportBlock namedImportBlock) {
        this.namedImportBlock = namedImportBlock;
    }

    @Override
    public String toString() {
        return namedImportBlock.toString();
    }
}

package excel.comparison;

import utility.ExcelUtility;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by biantech on 2021/1/25.
 */
public class WorkbookData {

    public List<SheetData> getSheetsData() {
        return sheetsData;
    }

    private List<SheetData> sheetsData = new ArrayList<SheetData>();

    private String filePath;

    public WorkbookData(String path) throws IOException {
        this.filePath = path;
        sheetsData = ExcelUtility.readExcel2007(filePath);
    }
}

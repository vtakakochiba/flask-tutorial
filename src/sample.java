public class SamplePoi {

  public static void main(String[] args) throws IOException {
    OutputStream os = null;
    try {
      os = new FileOutputStream("TestExcelFile.xlsx");
      XSSFWorkbook workbook = new XSSFWorkbook();
      workbook.createSheet();
      workbook.write(os);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (os != null) {
        os.close();
      }
    }
  }

}
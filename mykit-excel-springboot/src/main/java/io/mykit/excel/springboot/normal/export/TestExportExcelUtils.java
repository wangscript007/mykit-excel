/**
 * Copyright 2019-2999 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mykit.excel.springboot.normal.export;

import io.mykit.excel.springboot.normal.bean.Student;
import io.mykit.excel.utils.excel.BaseExcelExportUtils;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author binghe
 * @version 1.0.0
 * @description 测试导出Excel
 */
public class TestExportExcelUtils {
    public static void main(String[] args) throws Exception{
        BaseExcelExportUtils<Student> utils = new BaseExcelExportUtils<Student>();
        List<Student> list = new ArrayList<Student>();
        for (int i = 0; i < 10; i++) {
            list.add(new Student(111,"张三","男"));
            list.add(new Student(111,"李四","男"));
            list.add(new Student(111,"王五","女"));
        }
        String[] columnNames = { "ID", "姓名", "性别" };
        utils.exportExcel("用户导出", columnNames, list, new FileOutputStream("E:/test.xls"), BaseExcelExportUtils.EXCEL_FILE_2003);
    }
}

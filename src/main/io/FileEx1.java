package io;

import java.io.File;
import java.io.IOException;

public class FileEx1 {
    public static void main(String[] args) throws IOException {
        File f = new File("d:\\classJava\\workspace\\ojdbc8.jar");
        String fileName = f.getName();
        int pos = fileName.lastIndexOf("."); //IndextOf는 가 가지는 메서드
        System.out.println("경로를 제외한 파일명: " + fileName);
        System.out.println("확장자를 제외한 파일명: " + fileName.substring(0,pos));
        System.out.println("확장자: " + fileName.substring(pos+1));
        System.out.println("경로를 포함한 파일이름: " + f.getPath());
        System.out.println("파일의 절대경로: " + f.getAbsolutePath());
        System.out.println("파일의 정규경로: " + f.getCanonicalPath());
        System.out.println("파일이 속해 있는 디렉토리: " + f.getParent());
    }
}

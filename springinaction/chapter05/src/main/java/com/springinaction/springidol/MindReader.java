package com.springinaction.springidol;

/**
 * ��������
 * @ClassName: MindReader 
 * @Description: ���Զ�ȡ���˵�˼��
 * @author mao
 * @date 2017��3��23�� ����5:23:49 
 *
 */
public interface MindReader {
	
	//���ر��˵��뷨(��Ӧ���˵������뷨)
	void interceptThoughts(String thoughts);
	
	//����뷨
	String getThoughts();
}
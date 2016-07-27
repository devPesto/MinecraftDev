package com.demonwav.mcdev.util;

import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class McPsiUtil {

    @Nullable
    public static PsiClass getClassOfElement(@NotNull PsiElement element) {
        if (element instanceof PsiClass) {
            return (PsiClass) element;
        }

        while (element.getParent() != null) {

            if (element.getParent() instanceof PsiClass) {
                return (PsiClass) element.getParent();
            }

            if (element.getParent() instanceof PsiFile || element.getParent() instanceof PsiDirectory) {
                return null;
            }

            element = element.getParent();
        }
        return null;
    }

    public static boolean extendsOrImplementsClass(@NotNull PsiClass psiClass, @NotNull String qualifiedClassName) {
        final PsiClass[] supers = psiClass.getSupers();
        for (PsiClass aSuper : supers) {
            if (qualifiedClassName.equals(aSuper.getQualifiedName())) {
                return true;
            }
            if (extendsOrImplementsClass(aSuper, qualifiedClassName)) {
                return true;
            }
        }
        return false;
    }
}

// This is a generated file. Not intended for manual editing.
package name.kropp.intellij.makefile.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import name.kropp.intellij.makefile.psi.MakefileIdentifier;
import name.kropp.intellij.makefile.psi.MakefilePattern;
import name.kropp.intellij.makefile.psi.MakefileVisitor;
import org.jetbrains.annotations.NotNull;

public class MakefilePatternImpl extends ASTWrapperPsiElement implements MakefilePattern {

  public MakefilePatternImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MakefileVisitor visitor) {
    visitor.visitPattern(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MakefileVisitor) accept((MakefileVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public MakefileIdentifier getIdentifier() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, MakefileIdentifier.class));
  }

}

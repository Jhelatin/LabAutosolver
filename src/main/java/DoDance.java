import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.awt.Desktop;
public class DoDance extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        Messages.showMessageDialog("Hello World","Hello",Messages.getInformationIcon());

        Desktop d = Desktop.getDesktop();

        try {
            d.browse(new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
        } catch (IOException | URISyntaxException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public boolean isDumbAware() {
        return super.isDumbAware();
    }
}

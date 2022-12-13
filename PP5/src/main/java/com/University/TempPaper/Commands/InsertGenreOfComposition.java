package com.University.TempPaper.Commands;

import com.University.TempPaper.Controllers.Editor;
import com.University.TempPaper.Exceptions.StatementDontReturnValueException;
import com.University.TempPaper.Exceptions.VariableIsNull;
import com.University.TempPaper.Exceptions.ZeroRowChangedException;
import com.University.TempPaper.dao.RecordingStudio;

public class InsertGenreOfComposition extends Command{
    private RecordingStudio recordingStudio = new RecordingStudio();
    private int genreId;
    private int compositionId;

    public InsertGenreOfComposition(Editor editor, int compositionId, int genreId) {
        super(editor);
        this.genreId = genreId;
        this.compositionId = compositionId;
    }

    @Override
    public boolean execute() throws StatementDontReturnValueException, VariableIsNull, ZeroRowChangedException {
        recordingStudio.insertIntoGenreOfComposition(compositionId, genreId);
//        recordingStudio.selectC
        return true;
    }
}

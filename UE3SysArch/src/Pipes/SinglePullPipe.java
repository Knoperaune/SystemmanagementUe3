/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pipes;

import Filters.PullFilter;

/**
 *
 * @author phil
 */
public class SinglePullPipe<T> implements PullPipe<T> {

    private PullFilter<?, T> _source;

    /**
     * Erzeugt eine neue Pullpipe
     *
     * @param source
     */
    public SinglePullPipe(PullFilter<?, T> source) {
        if (source == null) {
            throw new IllegalArgumentException("source may not be null!");
        }

        _source = source;
    }

    @Override
    public T pull() {
        T output = _source.getOutput();

        //System.out.println("pullng from: " + _source + "; data: " + output);
        return output;
    }
}

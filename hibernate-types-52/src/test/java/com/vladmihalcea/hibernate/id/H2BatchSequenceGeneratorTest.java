package com.vladmihalcea.hibernate.id;

import com.vladmihalcea.hibernate.type.util.providers.DataSourceProvider;
import com.vladmihalcea.hibernate.type.util.providers.H2DataSourceProvider;

import static org.junit.Assert.assertEquals;

/**
 * @author Philippe Marschall
 */
public class H2BatchSequenceGeneratorTest extends AbstractBatchSequenceGeneratorTest {

    @Override
    protected DataSourceProvider dataSourceProvider() {
        return new H2DataSourceProvider();
    }
}
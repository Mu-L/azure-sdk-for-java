/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DataSourceKind.
 */
public final class DataSourceKind extends ExpandableStringEnum<DataSourceKind> {
    /** Static value WindowsEvent for DataSourceKind. */
    public static final DataSourceKind WINDOWS_EVENT = fromString("WindowsEvent");

    /** Static value WindowsPerformanceCounter for DataSourceKind. */
    public static final DataSourceKind WINDOWS_PERFORMANCE_COUNTER = fromString("WindowsPerformanceCounter");

    /** Static value IISLogs for DataSourceKind. */
    public static final DataSourceKind IISLOGS = fromString("IISLogs");

    /** Static value LinuxSyslog for DataSourceKind. */
    public static final DataSourceKind LINUX_SYSLOG = fromString("LinuxSyslog");

    /** Static value LinuxSyslogCollection for DataSourceKind. */
    public static final DataSourceKind LINUX_SYSLOG_COLLECTION = fromString("LinuxSyslogCollection");

    /** Static value LinuxPerformanceObject for DataSourceKind. */
    public static final DataSourceKind LINUX_PERFORMANCE_OBJECT = fromString("LinuxPerformanceObject");

    /** Static value LinuxPerformanceCollection for DataSourceKind. */
    public static final DataSourceKind LINUX_PERFORMANCE_COLLECTION = fromString("LinuxPerformanceCollection");

    /** Static value CustomLog for DataSourceKind. */
    public static final DataSourceKind CUSTOM_LOG = fromString("CustomLog");

    /** Static value CustomLogCollection for DataSourceKind. */
    public static final DataSourceKind CUSTOM_LOG_COLLECTION = fromString("CustomLogCollection");

    /** Static value AzureAuditLog for DataSourceKind. */
    public static final DataSourceKind AZURE_AUDIT_LOG = fromString("AzureAuditLog");

    /** Static value AzureActivityLog for DataSourceKind. */
    public static final DataSourceKind AZURE_ACTIVITY_LOG = fromString("AzureActivityLog");

    /** Static value GenericDataSource for DataSourceKind. */
    public static final DataSourceKind GENERIC_DATA_SOURCE = fromString("GenericDataSource");

    /** Static value ChangeTrackingCustomPath for DataSourceKind. */
    public static final DataSourceKind CHANGE_TRACKING_CUSTOM_PATH = fromString("ChangeTrackingCustomPath");

    /** Static value ChangeTrackingPath for DataSourceKind. */
    public static final DataSourceKind CHANGE_TRACKING_PATH = fromString("ChangeTrackingPath");

    /** Static value ChangeTrackingServices for DataSourceKind. */
    public static final DataSourceKind CHANGE_TRACKING_SERVICES = fromString("ChangeTrackingServices");

    /** Static value ChangeTrackingDataTypeConfiguration for DataSourceKind. */
    public static final DataSourceKind CHANGE_TRACKING_DATA_TYPE_CONFIGURATION = fromString("ChangeTrackingDataTypeConfiguration");

    /** Static value ChangeTrackingDefaultRegistry for DataSourceKind. */
    public static final DataSourceKind CHANGE_TRACKING_DEFAULT_REGISTRY = fromString("ChangeTrackingDefaultRegistry");

    /** Static value ChangeTrackingRegistry for DataSourceKind. */
    public static final DataSourceKind CHANGE_TRACKING_REGISTRY = fromString("ChangeTrackingRegistry");

    /** Static value ChangeTrackingLinuxPath for DataSourceKind. */
    public static final DataSourceKind CHANGE_TRACKING_LINUX_PATH = fromString("ChangeTrackingLinuxPath");

    /** Static value LinuxChangeTrackingPath for DataSourceKind. */
    public static final DataSourceKind LINUX_CHANGE_TRACKING_PATH = fromString("LinuxChangeTrackingPath");

    /** Static value ChangeTrackingContentLocation for DataSourceKind. */
    public static final DataSourceKind CHANGE_TRACKING_CONTENT_LOCATION = fromString("ChangeTrackingContentLocation");

    /** Static value WindowsTelemetry for DataSourceKind. */
    public static final DataSourceKind WINDOWS_TELEMETRY = fromString("WindowsTelemetry");

    /** Static value Office365 for DataSourceKind. */
    public static final DataSourceKind OFFICE365 = fromString("Office365");

    /** Static value SecurityWindowsBaselineConfiguration for DataSourceKind. */
    public static final DataSourceKind SECURITY_WINDOWS_BASELINE_CONFIGURATION = fromString("SecurityWindowsBaselineConfiguration");

    /** Static value SecurityCenterSecurityWindowsBaselineConfiguration for DataSourceKind. */
    public static final DataSourceKind SECURITY_CENTER_SECURITY_WINDOWS_BASELINE_CONFIGURATION = fromString("SecurityCenterSecurityWindowsBaselineConfiguration");

    /** Static value SecurityEventCollectionConfiguration for DataSourceKind. */
    public static final DataSourceKind SECURITY_EVENT_COLLECTION_CONFIGURATION = fromString("SecurityEventCollectionConfiguration");

    /** Static value SecurityInsightsSecurityEventCollectionConfiguration for DataSourceKind. */
    public static final DataSourceKind SECURITY_INSIGHTS_SECURITY_EVENT_COLLECTION_CONFIGURATION = fromString("SecurityInsightsSecurityEventCollectionConfiguration");

    /** Static value ImportComputerGroup for DataSourceKind. */
    public static final DataSourceKind IMPORT_COMPUTER_GROUP = fromString("ImportComputerGroup");

    /** Static value NetworkMonitoring for DataSourceKind. */
    public static final DataSourceKind NETWORK_MONITORING = fromString("NetworkMonitoring");

    /** Static value Itsm for DataSourceKind. */
    public static final DataSourceKind ITSM = fromString("Itsm");

    /** Static value DnsAnalytics for DataSourceKind. */
    public static final DataSourceKind DNS_ANALYTICS = fromString("DnsAnalytics");

    /** Static value ApplicationInsights for DataSourceKind. */
    public static final DataSourceKind APPLICATION_INSIGHTS = fromString("ApplicationInsights");

    /** Static value SqlDataClassification for DataSourceKind. */
    public static final DataSourceKind SQL_DATA_CLASSIFICATION = fromString("SqlDataClassification");

    /**
     * Creates or finds a DataSourceKind from its string representation.
     * @param name a name to look for
     * @return the corresponding DataSourceKind
     */
    @JsonCreator
    public static DataSourceKind fromString(String name) {
        return fromString(name, DataSourceKind.class);
    }

    /**
     * @return known DataSourceKind values
     */
    public static Collection<DataSourceKind> values() {
        return values(DataSourceKind.class);
    }
}

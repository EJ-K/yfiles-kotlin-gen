// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Enumeration that controls whether resources should be shared or not.
 * @see [GraphMLAttribute.shareable]
 * @see [XamlSerializer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLSharingPolicy">Online Documentation</a>
 */
external sealed class GraphMLSharingPolicy: YEnum<GraphMLSharingPolicy> {
   companion object: EnumMetadata<GraphMLSharingPolicy> {
       /**
 * Specifies that the share mode of a member should be determined automatically according to the current property value.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLSharingPolicy%23AUTO">Online Documentation</a>
 */
val AUTO: GraphMLSharingPolicy

/**
 * Never share the object.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLSharingPolicy%23NEVER">Online Documentation</a>
 */
val NEVER: GraphMLSharingPolicy

/**
 * Always share the object.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLSharingPolicy%23ALWAYS">Online Documentation</a>
 */
val ALWAYS: GraphMLSharingPolicy
   }
}

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
 * Enumeration that controls whether properties should be written as elements or attributes.
 * @see [GraphMLAttribute.writeAsAttribute]
 * @see [XamlSerializer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XamlAttributeWritePolicy">Online Documentation</a>
 */
external sealed class XamlAttributeWritePolicy: YEnum<XamlAttributeWritePolicy> {
   companion object: EnumMetadata<XamlAttributeWritePolicy> {
       /**
 * Specifies that the write mode of a member should be determined automatically according to the current property value and the presence of [ValueSerializer]s or implementations of [IMarkupExtensionConverter]s.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XamlAttributeWritePolicy%23AUTO">Online Documentation</a>
 */
val AUTO: XamlAttributeWritePolicy

/**
 * Never write as a XML attribute, even if a possible conversion exists.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XamlAttributeWritePolicy%23NEVER">Online Documentation</a>
 */
val NEVER: XamlAttributeWritePolicy

/**
 * Always write as XML attribute.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XamlAttributeWritePolicy%23ALWAYS">Online Documentation</a>
 */
val ALWAYS: XamlAttributeWritePolicy
   }
}

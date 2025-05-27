// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [HierarchicLayout.componentArrangementPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentArrangementPolicy">Online Documentation</a>
 */
external sealed class ComponentArrangementPolicy: YEnum<ComponentArrangementPolicy> {
   companion object: EnumMetadata<ComponentArrangementPolicy> {
       /**
 * A component arrangement policy that achieves a `1:1` aspect ratio for the graph.
 * 
 * Value - `0`
 * @see [HierarchicLayout.componentArrangementPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentArrangementPolicy%23COMPACT">Online Documentation</a>
 */
val COMPACT: ComponentArrangementPolicy

/**
 * A component arrangement policy that aligns the components with their topmost layer.
 * 
 * Value - `1`
 * @see [HierarchicLayout.componentArrangementPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentArrangementPolicy%23TOPMOST">Online Documentation</a>
 */
val TOPMOST: ComponentArrangementPolicy
   }
}

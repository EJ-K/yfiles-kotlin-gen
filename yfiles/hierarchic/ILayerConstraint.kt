// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * This interface describes a layering constraint.
 * @see [ILayerConstraintFactory]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayerConstraint">Online Documentation</a>
 */
external interface ILayerConstraint : YObject {
/**
 * Gets or sets the priority of a constraint.
 * 
 * Default value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayerConstraint%23priority">Online Documentation</a>
 */
var priority: Int

companion object : InterfaceMetadata<ILayerConstraint> {
}
}

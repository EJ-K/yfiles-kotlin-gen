// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * The policy constant used by [NodeReshapeHandleProvider] and [ReshapeHandlerHandle].
 * @see [NodeReshapeHandleProvider.ratioReshapeRecognizer]
 * @see [ReshapeHandlerHandle.ratioReshapeRecognizer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapePolicy">Online Documentation</a>
 */
external sealed class ReshapePolicy: YEnum<ReshapePolicy> {
   companion object: EnumMetadata<ReshapePolicy> {
       /**
 * The aspect ratio is ignored.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapePolicy%23NONE">Online Documentation</a>
 */
val NONE: ReshapePolicy

/**
 * Takes the bigger of the two bounds that would result when taking the [HORIZONTAL] and [VERTICAL] policies.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapePolicy%23MAXIMUM">Online Documentation</a>
 */
val MAXIMUM: ReshapePolicy

/**
 * Takes the smaller of the two bounds that would result when taking the [HORIZONTAL] and [VERTICAL] policies.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapePolicy%23MINIMUM">Online Documentation</a>
 */
val MINIMUM: ReshapePolicy

/**
 * Considers only the horizontal part of the mouse movement.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapePolicy%23HORIZONTAL">Online Documentation</a>
 */
val HORIZONTAL: ReshapePolicy

/**
 * Considers only the vertical part of the mouse movement.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapePolicy%23VERTICAL">Online Documentation</a>
 */
val VERTICAL: ReshapePolicy

/**
 * Projects the mouse location onto the resize direction line.
 * 
 * Value - `5`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapePolicy%23PROJECTION">Online Documentation</a>
 */
val PROJECTION: ReshapePolicy
   }
}

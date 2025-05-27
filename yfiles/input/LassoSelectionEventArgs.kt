// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.GeneralPath
import yfiles.lang.ClassMetadata

/**
 * Event arguments used by [LassoSelectionInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionEventArgs">Online Documentation</a>
 */
external open class LassoSelectionEventArgs  : InputModeEventArgs {

/**
 * Gets the current [lasso selection path][LassoSelectionInputMode.selectionPath] of the [LassoSelectionInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionEventArgs%23selectionPath">Online Documentation</a>
 */
final val selectionPath: GeneralPath

companion object : ClassMetadata<LassoSelectionEventArgs> {
}
}

// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * This interface should be implemented by classes that dispatch notifications about changes in [IPartition]s.
 * @see [IDecompositionListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDynamicDecomposition">Online Documentation</a>
 */
external interface IDynamicDecomposition : YObject {
/**
 * Adds the given [IDecompositionListener] that will be notified of dynamic decomposition events to the [IPartition].
 * @param [listener] the listener to be added
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDynamicDecomposition%23IDynamicDecomposition-method-addDynamicDecompositionListener">Online Documentation</a>
 */
   fun addDynamicDecompositionListener( listener: IDecompositionListener )
/**
 * Removes the given [IDecompositionListener] from the [IPartition].
 * @param [listener] the listener to be removed
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDynamicDecomposition%23IDynamicDecomposition-method-removeDynamicDecompositionListener">Online Documentation</a>
 */
   fun removeDynamicDecompositionListener( listener: IDecompositionListener )

companion object : InterfaceMetadata<IDynamicDecomposition> {
}
}

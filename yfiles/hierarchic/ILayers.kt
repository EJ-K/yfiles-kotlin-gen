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
 * This interface manages multiple [ILayer] instances.
 * @see [ILayer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayers">Online Documentation</a>
 */
external interface ILayers : YObject {
/**
 * Creates a new and empty [ILayers] instance that can be used on the same graph instance for temporary results.
 * @return a new and empty [ILayers] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayers%23ILayers-method-createInstance">Online Documentation</a>
 */
   fun createInstance():ILayers
/**
 * Returns the [layer][ILayer] at the specified position in this [list of layers][ILayers].
 * @param [i] the zero-based index of the [layer][ILayer] to return
 * @return the [layer][ILayer] at the specified position
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayers%23ILayers-method-getLayer">Online Documentation</a>
 */
   fun getLayer( i: Int ):ILayer
/**
 * Creates, inserts and returns a [layer][ILayer] of a given type associated with this [list of layers][ILayers].
 * @param [type] one of the predefined layer types as defined in [ILayer] interface
 * @param [position] the index at which the specified [layer][ILayer] is to be inserted
 * @return a new [ILayer] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayers%23ILayers-method-insert">Online Documentation</a>
 */
   fun insert( type: LayerType ,
 position: Int ):ILayer
/**
 * Removes the [layer][ILayer] at the specified position from this [list of layers][ILayers].
 * @param [index] the zero-based index of the [layer][ILayer] to remove
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayers%23ILayers-method-remove">Online Documentation</a>
 */
   fun remove( index: Int )
/**
 * Returns the number of [layers][ILayer] associated with this [ILayers] instance.
 * @return the number of layers of this [ILayers] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayers%23ILayers-method-size">Online Documentation</a>
 */
   fun size():Int

companion object : InterfaceMetadata<ILayers> {
}
}

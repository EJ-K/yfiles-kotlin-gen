// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.IRectangle
import yfiles.geometry.ISize
import yfiles.lang.ClassMetadata

/**
 * Abstract base class implementation of the [IReshapeHandleProvider] interface that has properties to restrict the size and area of a reshapeable.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeHandleProviderBase">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeHandleProviderBase%23ReshapeHandleProviderBase-constructor-ReshapeHandleProviderBase">Online Documentation</a>
 */
external abstract class ReshapeHandleProviderBase  () : IReshapeHandleProvider {

/**
 * Gets or sets the bitwise combination of all handle positions this instance provides a handle for.
 * @see [getAvailableHandles]
 * @see [RectangleReshapeHandleProvider.getHandle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeHandleProviderBase%23handlePositions">Online Documentation</a>
 */
final var handlePositions: HandlePositions
/**
 * Gets or sets the maximal bounds this reshapeable may fill.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeHandleProviderBase%23maximumBoundingArea">Online Documentation</a>
 */
final var maximumBoundingArea: IRectangle
/**
 * Gets or sets the maximum size allowed for the reshapeable.
 * 
 * The default value is [Size.INFINITE][yfiles.geometry.Size.INFINITE].
 * @see [RectangleHandle.maximumSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeHandleProviderBase%23maximumSize">Online Documentation</a>
 */
open var maximumSize: ISize
/**
 * Gets or sets the minimum rectangular area that needs to be contained in the reshapeable.
 * 
 * The default value is [Rect.EMPTY][yfiles.geometry.Rect.EMPTY].
 * @see [RectangleHandle.minimumEnclosedArea]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeHandleProviderBase%23minimumEnclosedArea">Online Documentation</a>
 */
open var minimumEnclosedArea: IRectangle
/**
 * Gets or sets the minimum size allowed for the reshapeable.
 * 
 * The default value is [Size.ZERO][yfiles.geometry.Size.ZERO].
 * @see [RectangleHandle.minimumSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeHandleProviderBase%23minimumSize">Online Documentation</a>
 */
open var minimumSize: ISize
/**
 * Returns the [handlePositions] property.
 * @return A bitwise combination of all handle positions this instance provides a handle for if queried in [RectangleReshapeHandleProvider.getHandle].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeHandleProviderBase%23ReshapeHandleProviderBase-method-getAvailableHandles">Online Documentation</a>
 */
 override   fun getAvailableHandles( context: IInputModeContext ):HandlePositions
/**
 * Provides a [IHandle] that uses the rectangle and reshapeable instance bound to this instance to perform the actual reshaping.
 * @param [context] The context for which the handles are queried.
 * @param [position] The position to provide an instance for.
 * @return A handle implementation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeHandleProviderBase%23ReshapeHandleProviderBase-method-getHandle">Online Documentation</a>
 */
 abstract override   fun getHandle( context: IInputModeContext ,
 position: HandlePositions ):IHandle

companion object : ClassMetadata<ReshapeHandleProviderBase> {
}
}

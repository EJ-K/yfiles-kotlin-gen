// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.graph.ILookup
import yfiles.input.IHitTestable
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Central interface used by the [CanvasComponent] to render elements from the scene graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObjectDescriptor">Online Documentation</a>
 */
external interface ICanvasObjectDescriptor<in T : YObject> : YObject {
/**
 * Returns an implementation of [IBoundsProvider] that can determine the visible bounds of the rendering of the user object.
 * @param [forUserObject] the user object to query the bounds for
 * @return An implementation of [IBoundsProvider] to determine the bounds of the visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObjectDescriptor%23ICanvasObjectDescriptor-method-getBoundsProvider">Online Documentation</a>
 */
   fun getBoundsProvider( forUserObject: T ):IBoundsProvider
/**
 * Returns an implementation of [IHitTestable] that can determine whether the rendering of the user object has been hit at a given coordinate.
 * @param [forUserObject] the user object to do the hit testing for
 * @return An implementation of [IHitTestable] to determine visibility.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObjectDescriptor%23ICanvasObjectDescriptor-method-getHitTestable">Online Documentation</a>
 */
   fun getHitTestable( forUserObject: T ):IHitTestable
/**
 * Returns an implementation of [IVisibilityTestable] that can determine if the rendering of the user object would be visible in a given context.
 * @param [forUserObject] the user object to query visibility for
 * @return An implementation of [IVisibilityTestable] to determine visibility.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObjectDescriptor%23ICanvasObjectDescriptor-method-getVisibilityTestable">Online Documentation</a>
 */
   fun getVisibilityTestable( forUserObject: T ):IVisibilityTestable
/**
 * Returns an implementation of [IVisualCreator] that will create the [Visual] tree for the user object.
 * @param [forUserObject] the user object to create a Visual for
 * @return An implementation of [IVisualCreator] to create or update the visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObjectDescriptor%23ICanvasObjectDescriptor-method-getVisualCreator">Online Documentation</a>
 */
   fun getVisualCreator( forUserObject: T ):IVisualCreator
/**
 * Determines whether the given canvas object is deemed dirty and needs updating.
 * @param [context] The context that will be used for the update.
 * @param [canvasObject] The object to check.
 * @return Whether an update is needed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObjectDescriptor%23ICanvasObjectDescriptor-method-isDirty">Online Documentation</a>
 */
   fun isDirty( context: ICanvasContext ,
 canvasObject: ICanvasObject ):Boolean

companion object : InterfaceMetadata<ICanvasObjectDescriptor<*>> {
/**
 * A descriptor that treats [ICanvasObject.userObject] as an instance of [IVisualCreator] and ignores the [ICanvasObject.dirty] flag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObjectDescriptor%23ALWAYS_DIRTY_INSTANCE">Online Documentation</a>
 */
 val ALWAYS_DIRTY_INSTANCE: ICanvasObjectDescriptor<IVisualCreator>
/**
 * A descriptor that treats [ICanvasObject.userObject] as an instance of [ILookup] to obtain suitable interface implementations and ignores the [ICanvasObject.dirty] flag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObjectDescriptor%23ALWAYS_DIRTY_LOOKUP">Online Documentation</a>
 */
 val ALWAYS_DIRTY_LOOKUP: ICanvasObjectDescriptor<ILookup>
/**
 * A descriptor that treats [ICanvasObject.userObject] as [Visual] to use directly.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObjectDescriptor%23ALWAYS_DIRTY_VISUAL">Online Documentation</a>
 */
 val ALWAYS_DIRTY_VISUAL: ICanvasObjectDescriptor<Visual>
/**
 * An implementation that treats [ICanvasObject.userObject] as an instance of [IVisualCreator] and considers the [ICanvasObject.dirty] flag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObjectDescriptor%23DYNAMIC_DIRTY_INSTANCE">Online Documentation</a>
 */
 val DYNAMIC_DIRTY_INSTANCE: ICanvasObjectDescriptor<IVisualCreator>
/**
 * A descriptor that treats [ICanvasObject.userObject] as an instance of [ILookup] to obtain suitable interface implementations and considers the [ICanvasObject.dirty] flag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObjectDescriptor%23DYNAMIC_DIRTY_LOOKUP">Online Documentation</a>
 */
 val DYNAMIC_DIRTY_LOOKUP: ICanvasObjectDescriptor<ILookup>
/**
 * A descriptor that treats [ICanvasObject.userObject] as [Visual] to use directly.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObjectDescriptor%23VISUAL">Online Documentation</a>
 */
 val VISUAL: ICanvasObjectDescriptor<Visual>
/**
 * An implementation that returns an [ICanvasObjectDescriptor] that does nothing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObjectDescriptor%23VOID">Online Documentation</a>
 */
 val VOID: ICanvasObjectDescriptor<YObject>
}
}

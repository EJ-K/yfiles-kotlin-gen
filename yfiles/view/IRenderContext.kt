// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import web.svg.SVGDefsElement
import yfiles.geometry.Matrix
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.lang.InterfaceMetadata

/**
 * An interface that describes the current context for rendering routines.
 * @see [IVisualCreator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRenderContext">Online Documentation</a>
 */
external interface IRenderContext : ICanvasContext {
/**
 * Gets the clipping rectangle in world coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRenderContext%23clip">Online Documentation</a>
 */
val clip: Rect
/**
 * Provides access to the `defs` element in the SVG DOM that is managed by this instance.
 * @see [svgDefsManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRenderContext%23defsElement">Online Documentation</a>
 */
val defsElement: SVGDefsElement
/**
 * Gets a transform that can be added to the transform list of a visual to be displayed in the intermediate coordinate system (which still has the same axes directions as the world coordinate system, but doesn't include the [CanvasComponent.projection]).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRenderContext%23intermediateTransform">Online Documentation</a>
 */
val intermediateTransform: Matrix
/**
 * Gets a transform that is applied to the contents of the [clip] rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRenderContext%23projection">Online Documentation</a>
 */
val projection: Matrix
/**
 * Provides access to the [SvgDefsManager] that manages this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRenderContext%23svgDefsManager">Online Documentation</a>
 */
val svgDefsManager: SvgDefsManager
/**
 * Gets a transform that can be added to the transform list of a visual to be displayed in the view coordinate system.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRenderContext%23viewTransform">Online Documentation</a>
 */
val viewTransform: Matrix
/**
 * Provides access to the [WebGLSupport] that provides convenience methods for WebGL rendering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRenderContext%23webGLSupport">Online Documentation</a>
 */
val webGLSupport: WebGLSupport
/**
 * Notifies the context that the `visual` has been removed from the visual tree.
 * @param [visual] The visual which has been removed.
 * @see [setDisposeCallback]
 * @see [IVisualCreator]
 * @see [IVisualCreator.updateVisual]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRenderContext%23IRenderContext-defaultmethod-childVisualRemoved">Online Documentation</a>
 */
  final  fun childVisualRemoved( visual: Visual? ):Unit = definedExternally
/**
 * Converts the given set of intermediate coordinates to a coordinate pair that can be used to render within the [viewTransform].
 * @param [intermediatePoint] The coordinates in the intermediate coordinate system.
 * @return The coordinates in the view coordinate system.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRenderContext%23IRenderContext-method-intermediateToViewCoordinates">Online Documentation</a>
 */
   fun intermediateToViewCoordinates( intermediatePoint: Point ):Point
/**
 * Registers a visual if children have registered themselves for disposal.
 * @param [visual] The visual to be registered. This is the visual which is returned by the [IVisualCreator.createVisual] or [IVisualCreator.updateVisual] method which calls this method.
 * @param [callback] A dispose visual callback which calls [childVisualRemoved] on all child visuals of the registered `visual`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRenderContext%23IRenderContext-defaultmethod-registerForChildrenIfNecessary">Online Documentation</a>
 */
  final  fun <TVisual : Visual>registerForChildrenIfNecessary( visual: TVisual? ,
 callback: DisposeVisualCallback<TVisual> ):Unit = definedExternally
/**
 * Registers a `callback` which will be called when the `visual` will be removed from the visual tree.
 * @param [visual] The visual which needs to be disposed after removal.
 * @param [callback] A callback which will dispose the `visual`.
 * @see [IVisualCreator]
 * @see [IVisualCreator.createVisual]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRenderContext%23IRenderContext-defaultmethod-setDisposeCallback">Online Documentation</a>
 */
  final  fun <TVisual : Visual>setDisposeCallback( visual: TVisual ,
 callback: DisposeVisualCallback<TVisual> ):Unit = definedExternally
/**
 * Converts the given set of world coordinates to a coordinate pair that can be used to render within the [viewTransform].
 * @param [worldPoint] The coordinates in the world coordinate system.
 * @return The coordinates in the view coordinate system.
 * @see [viewTransform]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRenderContext%23IRenderContext-method-toViewCoordinates">Online Documentation</a>
 */
   fun toViewCoordinates( worldPoint: Point ):Point
/**
 * Converts the given set of world coordinates to a coordinate pair that can be used to render within the [intermediateTransform].
 * @param [worldPoint] The coordinates in the world coordinate system.
 * @return The coordinates in the intermediate coordinate system.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRenderContext%23IRenderContext-method-worldToIntermediateCoordinates">Online Documentation</a>
 */
   fun worldToIntermediateCoordinates( worldPoint: Point ):Point

companion object : InterfaceMetadata<IRenderContext> {
}
}

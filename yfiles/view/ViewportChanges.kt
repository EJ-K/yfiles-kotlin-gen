// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.YFlags

/**
 * Specifies constants that define actions that change the [viewport][CanvasComponent] of a [CanvasComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportChanges">Online Documentation</a>
 */

external class ViewportChanges private constructor(): YFlags<ViewportChanges> {
  companion object {
    /**
     * None of the viewport changes should be animated.
     * 
     * Value - `0`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportChanges%23NONE">Online Documentation</a>
     */
    val NONE: ViewportChanges
    
    /**
     * Changing the viewport via [autoScrollOnBounds][CanvasComponent] should be animated.
     * 
     * Value - `1`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportChanges%23AUTO_SCROLL_ON_BOUNDS">Online Documentation</a>
     */
    val AUTO_SCROLL_ON_BOUNDS: ViewportChanges
    
    /**
     * Changing the zoom of the viewport via mouse wheel should be animated.
     * 
     * Value - `2`
     * @see [CanvasComponent.mouseWheelBehavior]
     * @see [CanvasComponent.mouseWheelZoomFactor]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportChanges%23MOUSE_WHEEL_ZOOM">Online Documentation</a>
     */
    val MOUSE_WHEEL_ZOOM: ViewportChanges
    
    /**
     * Scrolling the viewport via mouse wheel should be animated.
     * 
     * Value - `4`
     * @see [CanvasComponent.mouseWheelBehavior]
     * @see [CanvasComponent.mouseWheelScrollFactor]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportChanges%23MOUSE_WHEEL_SCROLL">Online Documentation</a>
     */
    val MOUSE_WHEEL_SCROLL: ViewportChanges
    
    /**
     * Scrolling the viewport by changing the scroll bar values should be animated.
     * 
     * Value - `8`
     * @see [CanvasComponent.horizontalScrollBarPolicy]
     * @see [CanvasComponent.verticalScrollBarPolicy]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportChanges%23SCROLL_BAR">Online Documentation</a>
     */
    val SCROLL_BAR: ViewportChanges
    
    /**
     * Changing the zoom of the viewport via [ZOOM][yfiles.input.Command], [INCREASE_ZOOM][yfiles.input.Command], [DECREASE_ZOOM][yfiles.input.Command], [ZOOM_TO_CURRENT_ITEM][yfiles.input.Command], or [ZOOM_TO_SELECTION][yfiles.input.Command] should be animated.
     * 
     * Value - `16`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportChanges%23ZOOM_COMMAND">Online Documentation</a>
     */
    val ZOOM_COMMAND: ViewportChanges
    
    /**
     * Scrolling the viewport via [SCROLL_PAGE_UP][yfiles.input.Command], [SCROLL_PAGE_DOWN][yfiles.input.Command], [SCROLL_PAGE_LEFT][yfiles.input.Command], or [SCROLL_PAGE_RIGHT][yfiles.input.Command] should be animated.
     * 
     * Value - `32`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportChanges%23SCROLL_COMMAND">Online Documentation</a>
     */
    val SCROLL_COMMAND: ViewportChanges
    
    /**
     * Changing the viewport via [FIT_CONTENT][yfiles.input.Command] or [FIT_GRAPH_BOUNDS][yfiles.input.Command] should be animated.
     * 
     * Value - `64`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportChanges%23FIT_CONTENT_COMMAND">Online Documentation</a>
     */
    val FIT_CONTENT_COMMAND: ViewportChanges
    
    /**
     * Changing the viewport via [ensureVisible][CanvasComponent] should be animated.
     * 
     * Value - `128`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportChanges%23ENSURE_VISIBLE">Online Documentation</a>
     */
    val ENSURE_VISIBLE: ViewportChanges
    
    /**
     * All viewport changes should be animated.
     * 
     * Value - `255`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportChanges%23ALL">Online Documentation</a>
     */
    val ALL: ViewportChanges
  }
}

// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.geometry.GeneralPath
import yfiles.geometry.Point
import yfiles.lang.ClassMetadata

/**
 * Helper class that calculates visual hints in a path where said path crosses an obstacle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeManager">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [BridgeManager] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeManager%23BridgeManager-constructor-BridgeManager">Online Documentation</a>
 */
open external class BridgeManager ()  {
  /**
   * Gets or sets the [BridgeCrossingPolicy] mode that is used by this instance.
   * 
   * By default the [HORIZONTAL_BRIDGES_VERTICAL][BridgeCrossingPolicy] mode is set.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeManager%23bridgeCrossingPolicy">Online Documentation</a>
   */
  final var bridgeCrossingPolicy: BridgeCrossingPolicy
  
  /**
   * Gets or sets the [canvasComponent][BridgeManager] that should be managed by this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeManager%23canvasComponent">Online Documentation</a>
   */
  final var canvasComponent: CanvasComponent?
  
  /**
   * Gets or sets a value that determines whether curves ([cubic][GeneralPath] and [quadratic][GeneralPath]) should be considered as obstacles.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeManager%23considerCurves">Online Documentation</a>
   */
  final var considerCurves: Boolean
  
  /**
   * Gets or sets the default implementation of the [IBridgeCreator] that will be used if [addBridges][BridgeManager] is invoked with a `null` callback argument.
   * @see [defaultBridgeCrossingStyle]
   * @see [defaultBridgeWidth]
   * @see [defaultBridgeHeight]
   * @see [insertDefaultCustomBridge]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeManager%23defaultBridgeCreator">Online Documentation</a>
   */
  final var defaultBridgeCreator: IBridgeCreator
  
  /**
   * Gets or sets the default [BridgeCrossingStyle] that will be used by the default implementation of the [IBridgeCreator] that is initially assigned to the [defaultBridgeCreator][BridgeManager] property.
   * 
   * The default value is [ARC][BridgeCrossingStyle].
   * @see [IBridgeCreator.getCrossingStyle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeManager%23defaultBridgeCrossingStyle">Online Documentation</a>
   */
  final var defaultBridgeCrossingStyle: BridgeCrossingStyle
  
  /**
   * Gets or sets the default height of a bridge that will be used by the default implementation of the [IBridgeCreator] that is initially assigned to the [defaultBridgeCreator][BridgeManager] property.
   * 
   * The default value is `5.0`.
   * @see [IBridgeCreator.getBridgeHeight]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeManager%23defaultBridgeHeight">Online Documentation</a>
   */
  final var defaultBridgeHeight: Double
  
  /**
   * Gets or sets the default [BridgeOrientationStyle] for bridges that will be used by the default implementation of the [IBridgeCreator] that is initially assigned to the [defaultBridgeCreator][BridgeManager] property.
   * 
   * The default is [UP][BridgeOrientationStyle].
   * @see [IBridgeCreator.getOrientationStyle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeManager%23defaultBridgeOrientationStyle">Online Documentation</a>
   */
  final var defaultBridgeOrientationStyle: BridgeOrientationStyle
  
  /**
   * Gets or sets the default width of a bridge that will be used by the default implementation of the [IBridgeCreator] that is initially assigned to the [defaultBridgeCreator][BridgeManager] property.
   * 
   * The default value is `10.0`.
   * @see [IBridgeCreator.getBridgeWidth]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeManager%23defaultBridgeWidth">Online Documentation</a>
   */
  final var defaultBridgeWidth: Double
  
  /**
   * Gets or sets a threshold value that determines below which zoom level, there should be no more bridge calculation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeManager%23zoomThreshold">Online Documentation</a>
   */
  final var zoomThreshold: Double
  
  /**
   * Core method that will add bridges to a [GeneralPath] using the [IBridgeCreator] callback to determine the type of the bridges.
   * @param [context] The context to use.
   * @param [path] The path to calculate the bridged variant for.
   * @param [callback] The callback or `null` that determines the appearance of the bridges.
   * @return The path that might have been augmented by the bridges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeManager%23BridgeManager-method-addBridges">Online Documentation</a>
   */
  open fun addBridges(
    context: IRenderContext,
    path: GeneralPath,
    callback: IBridgeCreator?  = definedExternally,
  ): GeneralPath
  
  /**
   * Adds another [IObstacleProvider] to query for obstacles.
   * @param [provider] The provider instance to use for later queries.
   * @see [registerObstacles]
   * @see [removeObstacleProvider]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeManager%23BridgeManager-method-addObstacleProvider">Online Documentation</a>
   */
  open fun addObstacleProvider(
    provider: IObstacleProvider,
  )
  
  /**
   * Disposes of this instance by resetting the [canvasComponent][BridgeManager] property to `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeManager%23BridgeManager-method-dispose">Online Documentation</a>
   */
  open fun dispose()
  
  /**
   * Gets a hash code that describes the current state of the obstacles.
   * @param [context] The context to inspect.
   * @return A hash of the state of the obstacles.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeManager%23BridgeManager-method-getObstacleHash">Online Documentation</a>
   */
  open fun getObstacleHash(
    context: IRenderContext,
  ): Int
  
  /**
   * Implementation that will be called by the default value of the [defaultBridgeCreator][BridgeManager] to satisfy requests to [createCustomBridge][IBridgeCreator].
   * @param [context] The context for the call.
   * @param [path] The path to append the next segment to.
   * @param [start] The coordinates of the starting point of the bridge.
   * @param [end] The coordinates of the ending point of the bridge.
   * @param [gapLength] The distance between the starting point and the end point.
   * @see [IBridgeCreator.createCustomBridge]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeManager%23BridgeManager-method-insertDefaultCustomBridge">Online Documentation</a>
   */
  open fun insertDefaultCustomBridge(
    context: IRenderContext,
    path: GeneralPath,
    start: Point,
    end: Point,
    gapLength: Double,
  )
  
  /**
   * Installs this manager for the specified [canvasComponent][BridgeManager].
   * @param [canvasComponent] The [canvasComponent][BridgeManager].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeManager%23BridgeManager-method-install">Online Documentation</a>
   */
  protected open fun install(
    canvasComponent: CanvasComponent,
  )
  
  /**
   * Dynamically registers an obstacle path with the context during the rendering.
   * @param [context] The context to register the obstacles with.
   * @param [path] The path that describes the obstacles.
   * @see [registerObstacleLine]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeManager%23BridgeManager-method-registerObstacle">Online Documentation</a>
   */
  open fun registerObstacle(
    context: IRenderContext,
    path: GeneralPath,
  )
  
  /**
   * Dynamically registers a single obstacle cubic curve with the context during the rendering.
   * @param [context] The context to register the obstacles with.
   * @param [p1] The coordinates of the starting point of the line.
   * @param [cp1] The coordinates of the first control point of the curve.
   * @param [cp2] The coordinates of the second control point of the curve.
   * @param [p2] The coordinates of the ending point of the line.
   * @see [registerObstacleLine]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeManager%23BridgeManager-method-registerObstacleCubicCurve">Online Documentation</a>
   */
  open fun registerObstacleCubicCurve(
    context: IRenderContext,
    p1: Point,
    cp1: Point,
    cp2: Point,
    p2: Point,
  )
  
  /**
   * Dynamically registers a single obstacle line with the context during the rendering.
   * @param [context] The context to register the obstacles with.
   * @param [p1] The coordinates of the first point of the line.
   * @param [p2] The coordinates of the second point of the line.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeManager%23BridgeManager-method-registerObstacleLine">Online Documentation</a>
   */
  open fun registerObstacleLine(
    context: IRenderContext,
    p1: Point,
    p2: Point,
  )
  
  /**
   * Dynamically registers a single obstacle quadratic curve with the context during the rendering.
   * @param [context] The context to register the obstacles with.
   * @param [p1] The coordinates of the starting point of the line.
   * @param [cp] The coordinates of the control point of the curve.
   * @param [p2] The coordinates of the ending point of the line.
   * @see [registerObstacleLine]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeManager%23BridgeManager-method-registerObstacleQuadCurve">Online Documentation</a>
   */
  open fun registerObstacleQuadCurve(
    context: IRenderContext,
    p1: Point,
    cp: Point,
    p2: Point,
  )
  
  /**
   * Called to initialize the context with the obstacles.
   * @param [context] The context that will be used to store the obstacles within.
   * @see [registerObstacle]
   * @see [registerObstacleLine]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeManager%23BridgeManager-method-registerObstacles">Online Documentation</a>
   */
  protected open fun registerObstacles(
    context: IRenderContext,
  )
  
  /**
   * Removes a previously [added][BridgeManager] [IObstacleProvider] from the list of registered providers.
   * @param [provider] The provider instance to remove from this instance.
   * @see [addObstacleProvider]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeManager%23BridgeManager-method-removeObstacleProvider">Online Documentation</a>
   */
  open fun removeObstacleProvider(
    provider: IObstacleProvider,
  )
  
  /**
   * Reverts the [install][BridgeManager] method.
   * @param [canvasComponent] The [canvasComponent][BridgeManager].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeManager%23BridgeManager-method-uninstall">Online Documentation</a>
   */
  protected open fun uninstall(
    canvasComponent: CanvasComponent,
  )
  
  companion object : ClassMetadata<BridgeManager> {
  }
}

inline fun BridgeManager(
    block: BridgeManager.() -> Unit
): BridgeManager {
    return BridgeManager()
        .apply(block)
}

import net.sf.javaml.core.Instance;
import net.sf.javaml.core.Dataset;
import net.sf.javaml.core.DefaultDataset;
import net.sf.javaml.core.DenseInstance;
import net.sf.javaml.clustering.Clusterer;
import net.sf.javaml.clustering.KMeans;
import net.sf.javaml.clustering.DensityBasedSpatialClustering;
import net.sf.javaml.clustering.FarthestFirst;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Load the Iris dataset
        Dataset data = loadIrisDataset();

        // Perform clustering using KMeans
        Clusterer kmeans = new KMeans(3); // Number of clusters = 3
        Dataset[] kmeansClusters = kmeans.cluster(data);

        // Perform clustering using DBSCAN
        Clusterer dbscan = new DensityBasedSpatialClustering();
        Dataset[] dbscanClusters = dbscan.cluster(data);

        // Perform clustering using Farthest First
        Clusterer farthestFirst = new FarthestFirst(); // Number of clusters = 3
        Dataset[] farthestFirstClusters = farthestFirst.cluster(data);

        // Print the output
        System.out.println("KMeans Clustering:");
        printClusters(kmeansClusters);
        System.out.println("\nDBSCAN Clustering:");
        printClusters(dbscanClusters);
        System.out.println("\nFarthest First Clustering:");
        printClusters(farthestFirstClusters);
    }

    private static Dataset loadIrisDataset() {
        Dataset dataset = new DefaultDataset();
        try (BufferedReader br = new BufferedReader(new FileReader("iris.data"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                double[] features = new double[values.length - 1];
                for (int i = 0; i < values.length - 1; i++) {
                    features[i] = Double.parseDouble(values[i]);
                }
                Instance instance = new DenseInstance(features);
                instance.setClassValue(values[values.length - 1]);
                dataset.add(instance);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataset;
    }

    private static void printClusters(Dataset[] clusters) {
        for (int i = 0; i < clusters.length; i++) {
            System.out.println("Cluster " + (i + 1) + ":");
            for (Instance instance : clusters[i]) {
                System.out.println(instance);
            }
            System.out.println();
        }
    }
}
